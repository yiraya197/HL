import javax.swing.JOptionPane;;
    void main(){
       String texto1 =JOptionPane.showInputDialog("ingrese numero de productos");
       int producto=Integer.parseInt(texto1);
        String texto2 =JOptionPane.showInputDialog("ingrese numero de trabajadores");
        int trabajador=Integer.parseInt(texto2);

        try {
            int resultado = producto/trabajador;
            JOptionPane.showMessageDialog(null,"a cada trabajador le toca "+resultado);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog( null,"error no funciona","error",JOptionPane.ERROR_MESSAGE );

        }
        JOptionPane.showMessageDialog( null,"el sistema  sigue funcionando");
        JOptionPane.showMessageDialog(null,"==hasta luego==");

    }