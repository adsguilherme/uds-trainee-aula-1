import java.util.Scanner;

class Main {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer entrada;

        do {
            System.out.println("Digite ai: ");

            entrada = scanner.nextInt();

            System.out.println("O número convertido para algarismo romano é: " + converterInteiroParaRomanos(entrada));
        }while (entrada != -1);
    }

    public static String converterInteiroParaRomanos(Integer numeroDecimal) {

        String conveterRomano = "";
        Integer cont;

        String[] iniciaValores = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        for(cont=0; cont <= 10; cont++ ){
            if(numeroDecimal == cont && numeroDecimal != 0){
                cont = cont - 1;
                conveterRomano = iniciaValores[cont];
                break;
            }
            else
            {
                conveterRomano =  "Número deve ser de 1 até 10";
                break;
            }
        }

//        switch (numeroDecimal) {
//                case 1:
//                    conveterRomano = "I";
//                    break;
//                case 2:
//                    conveterRomano = "II";
//                    break;
//                case 3:
//                    conveterRomano = "III";
//                    break;
//                case 4:
//                    conveterRomano = "IV";
//                    break;
//                case 5:
//                    conveterRomano = "V";
//                    break;
//                case 6:
//                    conveterRomano = "VI";
//                    break;
//                case 7:
//                    conveterRomano = "VII";
//                    break;
//                case 8:
//                    conveterRomano = "VIII";
//                    break;
//                case 9:
//                    conveterRomano = "IX";
//                    break;
//                case 10:
//                    conveterRomano = "X";
//                    break;
//                default:
//                    return erro;
//
//        }
        return conveterRomano;
    }
}