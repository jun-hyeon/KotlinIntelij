import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Jhava {

    private int hitPoints = 52489112;
    private String greeting = "BLARGH";
    @NotNull
    public String utterGreeting(){
        return greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Nullable
    public String determineFriendsshipLevel(){
        return null;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());

    }

    public void offerFood(){
        Hero.handOverFood("피자");
    }
}
