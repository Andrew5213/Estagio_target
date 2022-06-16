package atv4;

public class faturamento {
    public void media(double sp, double mg, double rj, double es, double outros){
        double soma=sp+mg+rj+es+outros;
        double medMg,medSp,medEs,medRj,medOutros;
        medMg=(mg*100)/soma;
        medEs=(es*100)/soma;
        medOutros=(outros*100)/soma;
        medRj=(rj*100)/soma;
        medSp=(sp*100)/soma;
        System.out.println("----------------Porcentagens-------------");
        System.out.println("SP:"+medSp+"%");
        System.out.println("RJ:"+medRj+"%");
        System.out.println("MG:"+medMg+"%");
        System.out.println("ES:"+medEs+"%");
        System.out.println("OUTROS:"+medOutros+"%");
        System.out.println("-----------------------------------------");
    }
}
