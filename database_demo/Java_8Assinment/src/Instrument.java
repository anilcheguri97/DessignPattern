public class Instrument implements Piano,Guitar {
  /*  @Override
    public void play() {
        Piano.super.play(); // calling piano or guitar default method
    }*/

    @Override
    public void play() {
        System.out.println("calling customized instrument to play ");
    }
}
