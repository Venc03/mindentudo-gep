package mindentudogep;

import java.util.Random;

public class Model {
    private int[] lottoSz;
    private String totoSz;
    private String[] dalok;
    
    public Model(){
        this(new String[0]);
    };
    
    public Model(String dal){
        this(new String[]{dal});
    }
        
    public Model(String[] dalok){
        resi();
        this.dallalFeltolt();
        if(!(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalFelvesz(dalok);
        }
    };

    public void resi(){
        this.genLottoSzelv();
        this.genTotoSzelv();
        this.dallalFeltolt();
    }
    
    private void dallalFeltolt() {
        this.dalok = new String[3];
        dalok[0] = "Az elet";
        dalok[1] = "Az jo";
        dalok[2] = "Es kesz";
    }


    private void dalFelvesz(String[] dalok) {
        
    }

    private void genTotoSzelv() {
        this.totoSz = "";
        String vege = "13+1";
        String[] totovalasz = {"x", "1", "2"};
        Random rnd = new Random();
        int x = 1;
        while(x < 13){
            System.out.println(x);
            int rnd2 = rnd.nextInt(3);
            System.out.println(totovalasz[rnd2] + "\n");
            x++;
        }
        System.out.println(vege);
        int rnd2 = rnd.nextInt(3);
        System.out.println(totovalasz[rnd2]);
        
    }

    private void genLottoSzelv() {
        this.lottoSz = new int[5];
        Random rnd = new Random();
        int x = 0;
        while(x < lottoSz.length){
            int rnd1 = rnd.nextInt(1, 90);
            if(!benneVan(rnd1, lottoSz[x], lottoSz)){
                lottoSz[x] = rnd1;
                x++;
            }
        }
    }

    String kerDal() {
        Random rnd = new Random();
        int rnd2 = rnd.nextInt(3);
        return dalok[rnd2];
    }

    private boolean benneVan(int rnd1, int lottoSzX, int[] lottoSz) {
        int i = 0;
        while(i < lottoSzX && !(lottoSz[i] == rnd1)){
            i++;
        }
        return true || false;
    }
}
