import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationFormat format) {
        if (format == PresentationFormat.PDF) {
            var pdfDocument = new PdfDocument();
            for (var slide : slides) {
                pdfDocument.addPage(slide.getText());
            }
        } else if (format == PresentationFormat.PPT) {
            var pptDocument = new PptDocument();
            for (var slide : slides) {
                pptDocument.addSlide(slide.getText());
            }
        } else if (format == PresentationFormat.IMAGE) {
            var imageDocument = new ImageDocument();
            for (var slide : slides) {
                imageDocument.addImage(slide.getText());
            }
        } else if (format == PresentationFormat.VIDEO) {
            var videoDocument = new VideoDocument();
            for (var slide : slides) {
                videoDocument.addFrame(slide.getText(), 1);
            }
        }
    }
}
