import static org.junit.jupiter.api.Assertions.*;

import java.awt.Button;

import org.junit.jupiter.api.Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

class InterFaceTest extends Application {

	
	  private Button button;

	    /**
	     * Will be called with {@code @Before} semantics, i. e. before each test method.
	     */
	    @Override
	    public void start(Stage stage) {
	        button = new Button("click me!");
	        button.setOnAction(actionEvent -> button.setText("clicked!"));
	        stage.setScene(new Scene(new StackPane(button), 100, 100));
	        stage.show();
	    }

	    @Test
	    public void should_contain_button_with_text() {
	        Assertions.assertThat(button).hasText("click me!");
	    }

	    @Test
	    public void when_button_is_clicked_text_changes() {
	        // when:
	        clickOn(".button");

	        // then:
	        Assertions.assertThat(button).hasText("clicked!");
	    }

}
