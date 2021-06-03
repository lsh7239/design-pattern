package pattern.chains;

public class ChainFactory {

    public static Chain createChain(){
        Chain basicOffer = new BasicOffer();
        Chain timeOffer = new TimeOffer();
        Chain gradeOffer = new GradeOffer();

        basicOffer.setNext(timeOffer);
        timeOffer.setNext(gradeOffer);

        return basicOffer;
    }
}
