package tasks;


import interactions.FindElement;
import interactions.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindBlog implements Task {
    String blogName;

    public FindBlog(String blogName) {
        this.blogName = blogName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Navigate.to("Blog"));
        actor.attemptsTo(FindElement.inBlogs(blogName));
    }

    public static FindBlog inPage(String blogName) {
        return Tasks.instrumented(FindBlog.class, blogName);
    }
}
