package atv3;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObject;
        //Cria o parse de tratamento
        JSONParser parser = new JSONParser();
        //Variaveis que irao armazenar os dados do arquivo JSON
        int dia;
        float valor;


        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    "C:\\Users\\andre\\IdeaProjects\\Estagio_target\\src\\atv3\\dados.json"));

            float[] vetor = new float[30];//como o arquivo tem 30 dias entao o vetor vai ter 30 p
            for (int i=0;i< vetor.length;i++){ //gravando dados em um vetor
                dia= (int) jsonObject.get("dia");
                valor= (float) jsonObject.get("valor");
                vetor[i]=valor;
               // vetor[dia]= valor;

            }
            float maior=0,soma=0;
            float menor =vetor[0];
            int posi1 = 0,p2 = 0;
            for (int i=0;i< vetor.length;i++){
                if (maior<vetor[i]){
                    maior=vetor[i];
                    posi1=i;
                }
                if (menor>vetor[i]){
                    menor=vetor[i];
                    p2=i;
                }

            }
            //agora vamos fazer a soma
            for (int i=0; i< vetor.length;i++){
                soma=soma+vetor[i];

            }
            //vamos fazer a media que e soma/dia=30
            float media=soma/30;
            int contador=0;
            //agora vamos achar os dias que a media for acima
            for (int i=0 ; i< vetor.length;i++){
                if (vetor[i]>media){
                    contador++;
                }
            }
            System.out.println("o menor valor esta no dia "+p2+1+" com o valor de : "+menor);
            System.out.println("o maior valor esta no dia :"+posi1+1+"com o valor de :"+maior);
            System.out.println("os dias em que o valor estava acima da media foi: "+contador);

            //System.out.printf();
        }
        //Trata as exceptions que podem ser lançadas no decorrer do processo
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
