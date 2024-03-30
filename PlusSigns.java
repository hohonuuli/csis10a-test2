import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PlusSigns extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        stage.setTitle(getClass().getSimpleName());

        // Use Border pane to center content
        BorderPane pane = new BorderPane();
        Canvas canvas = new Canvas(300, 300);
        pane.setCenter(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.GRAY);
        draw(graphicsContext);
        stage.setScene(new Scene(pane));
        stage.show();
    }

    private void draw(GraphicsContext g) {
        // YOUR CODE GOES HERE
        drawPlus(g, 50, 100);
        drawPlus(g, 100, 100);
    }

    private void drawPlus(GraphicsContext g, int x, int y) {
        double length = 40;
        double half = length / 2;
        g.strokeLine(x - half, y, x + half, y);
        g.strokeLine(x, y - half, x, y + half);
    }


}
