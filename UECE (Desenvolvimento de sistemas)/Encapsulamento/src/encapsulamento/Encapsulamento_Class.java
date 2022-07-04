package encapsulamento;

public class Encapsulamento_Class implements Encapsulamento_Interface {
    private boolean ligado;
    private boolean mute;
    private boolean menu;
    private boolean play;
    private int canal;
    private int volume;


    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void MaisVolume() {
        if(isLigado() & this.getVolume() < 100){
            this.setVolume(this.volume + 1);}
    }

    @Override
    public void MenosVolume() {
        if (isLigado() && this.getVolume() > 0)
            this.setVolume(this.volume - 1);
    }

    @Override
    public void AbrirMenu() {
        System.out.println("======MENU======");
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Mute: " + this.isMute());
        System.out.println("Volume: " + this.getVolume());
    }

    @Override
    public void FecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void MudarCanalAcima() {
    if (isLigado()){    
        this.setCanal(this.canal + 1);}
    }

    @Override
    public void MudarCanalAbaixo() {
    if (isLigado() && this.getCanal() > 0)    
        this.setCanal(this.canal - 1);
    }

    @Override
    public void LigarMudo() {
        if (isLigado() && this.getVolume() > 0){
            this.setVolume(0);}
    }

    @Override
    public void DesligarMudo() {
        if (isLigado() && this.getVolume() == 0){
            this.setVolume(100);}
    }

    @Override
    public void Play() {
        if (isLigado() && !(isPlay())){
            this.setPlay(true);}
    }

    @Override
    public void Pause() {
        this.setPlay(false);
    }
    
}
