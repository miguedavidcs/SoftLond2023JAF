import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import com.softlond.puras.FuncionPura;

public class App {
    public static void main(String[] args) throws Exception {
        // La programacion Funcional (Pensamiento Matematico)
        //1-Funciones Puras y Efectos Secundarios
        FuncionPura cuadrado = new FuncionPura();
         int entrada =5;
         int resultado2 = cuadrado.cuadrado(entrada);
         //System.out.println("Resultado "+ resultado);


        //2-Inmutabilidad
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> doblenumero = new ArrayList<>();
         for (int num : numeros) {
             doblenumero.add(num*2);        
            
         }
        //System.out.println("Lista Original: "+numeros);
        //System.out.println("Lista duplicada: "+doblenumero);
        //3-Expresiones Lambda y Funcion de Orden Superior
            numeros.forEach(x->System.out.println(x*2));

            List<Integer> eventoNumerico = new ArrayList<>();
            numeros.stream()
            .filter(x ->x % 2 == 0).forEach(eventoNumerico::add);
            System.out.println("Numeros Pares: "+eventoNumerico);

        //4-Composicion de Funciones
        Function<Integer,Integer> f1 = x->x*x;
        Function<Integer,Integer> f2 = x->x+1;
        Function<Integer,Integer> resultado = f1.compose(f2);

        int r = resultado.apply(2);
        System.out.println("Resultado "+ r);
        //5-Uso de Opcional
        String name = null;
        Optional<String> opcionalnombre = Optional.ofNullable(name);
        String nuevoNombre = opcionalnombre.orElse("Miguel");
        System.out.println("Hola soy "+nuevoNombre);

        //6-Stream y Operacion Funcional
        //7-Referencia a Metodos
        
    }
}
