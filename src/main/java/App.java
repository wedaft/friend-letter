import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {

        staticFileLocation("/public"); //this line has changed!

        get("/", (request, response) ->
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<title>Hello Friend!</title>" +
                        "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                        "</head>" +
                        "<body>" +
                        "<h1>Hello From Afar</h1>" +
                        "<p>Dear Friend,</p>" +
                        "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
                        "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
                        "<p>But I like programming a lot, so I've got that going for me. </p>" +
                        "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
                        "<p>Cheers,</p>" +
                        "<p>Travel Enthusiast Jane</p>" +
                        "</body>" +
                        "</html>"
        );
//new route below!
        get("/favorite_photos", (request, response) ->
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<title>Hello Friend!</title>" +
                        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                        "</head>" +
                        "<body>" +
                        "<h1>Favorite Traveling Photos</h1>" +
                        "<ul>" +
                        "<li><img src='/images/foggymountain.jpeg' alt='A photo of a mountain.'/></li>" +
                        "<li><img src='/images/rockycoast.jpeg' alt='A photo of a a rocky beach.'/></li>" +
                        "</ul>" +
                        "</body>" +
                        "</html>"
        );

    }
}
