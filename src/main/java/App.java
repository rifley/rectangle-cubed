import java.io.Console;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App{
	public static void main(String[] args) {
		staticFileLocation("/public");
		String layout = "templates/layout.vtl";

		get("/", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/index.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());

		get("/rectangle", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			int length = Integer.parseInt(request.queryParams("length"));
			int width = Integer.parseInt(request.queryParams("width"));

			Rectangle myRectangle = new Rectangle(length, width);
			model.put("myRectangle", myRectangle);

			if (myRectangle.isSquare()) {
        Cube myCube = new Cube(myRectangle);
        model.put("myCube", myCube);
      }

			model.put("template", "templates/rectangle.vtl");
			return new ModelAndView(model, layout);
			}, new VelocityTemplateEngine());
	}
}




// Console myConsole = System.console();
// System.out.println("Enter length");
// int length = Integer.parseInt(myConsole.readLine());
// System.out.println("Enter width");
// int width = Integer.parseInt(myConsole.readLine());
// Rectangle currentRectangle = new Rectangle(length, width);
// boolean squareResult = currentRectangle.isSquare();
// System.out.println ("Is you rectangle a square?: " + squareResult);
