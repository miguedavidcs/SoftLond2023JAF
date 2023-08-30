package com.tutorial.crud.security.jwt;

import java.security.Key;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;

import com.tutorial.crud.security.entity.UsuarioPrincipal;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;

public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication) {
        UsuarioPrincipal usuarioPrincipal = (UsuarioPrincipal) authentication.getPrincipal();
        Key key = Keys.hmacShaKeyFor(secret.getBytes());
        return Jwts.builder()
                .setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
                .signWith(key,SignatureAlgorithm.HS512)
                .compact();
    }

    public String getNombreUsuarioFromToken(String token) {
        JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(secret).build();
        Claims claims = jwtParser.parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
    

    public boolean validateToken(String token) {
        try {
            JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(secret).build();
            JwsHeader<?> header = jwtParser.parseClaimsJws(token).getHeader();
            String signatureAlgorithm = header.getAlgorithm();
            
            if (!SignatureAlgorithm.HS512.getValue().equals(signatureAlgorithm)) {
                logger.error("Algoritmo de firma no válido");
                return false;
            }
            
            return true; // Token válido
        } catch (MalformedJwtException e) {
            logger.error("Token mal formado", e);
        } catch (UnsupportedJwtException e) {
            logger.error("Token no soportado", e);
        } catch (ExpiredJwtException e) {
            logger.error("Token expirado", e);
        } catch (IllegalArgumentException e) {
            logger.error("Token vacío o nulo", e);
        }
    
        return false; // Token no válido
    }
       
}
