import javax.swing.*;

public class natu {
    public static void main(String[] agrs) {
        int n;
        int s;
        int sum = 0 , i= + 1;
        int mul;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "bienvenido porfavor ingrese un numero natural"));

         JOptionPane.showMessageDialog(null, "lo siguiente es la explicacion de cada ciclo" + "\n"
                + "siclo white: este siclo se usa cuando no sabes cuantas beses necesitas repetir una accion " + "\n" +
                "siclo do-while: este siclo es paresido al white solo que le cambia es que la condicion se ejecuta al menos una vez indentifica si la condicion es verdadera o falsa" + "\n" +
                "siclo for: se utiliza cuando sabes cuantas beses necesitas repetir");

        s = Integer.parseInt(JOptionPane.showInputDialog(null, "escoga alguno de los siclos:" + "\n" +
                "1 siclo while" + "\n" + "2 siclo do-while" + "\n" + "3 siclo for"));

        switch (s) {
            case 1:

                while (i <= n) {

i ++;
                    mul = i * n;
                    sum = i + sum;

                }
                JOptionPane.showMessageDialog(null, "el resultado es" + sum);
                break;

            case 2:

                do {
i ++;
                    mul = i * n;
                    sum = i + sum;

                } while (i <= n);
                JOptionPane.showMessageDialog(null, "el resultado es:" + sum);
             break;
            case 3:

                for (  i = 0 ; i  <= n ; i++) {
                    mul = n * i;
                    sum = i + sum;


                }
                JOptionPane.showMessageDialog(null, "el resultado es:" + sum);
        }
    }
}
