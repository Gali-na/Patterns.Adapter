public class AdaprterPainter implements Painter{
    TalentedPainter talentedPainter = new TalentedPainter();
    @Override
    public void draw() {
        talentedPainter.drawMasterpieces();
    }
}
