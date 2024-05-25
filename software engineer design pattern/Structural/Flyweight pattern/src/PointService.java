import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory icon;

    public PointService(PointIconFactory icon) {
        this.icon = icon;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();

        var point = new Point(1, 2, icon.getPointIcon(PointType.CAFE));

        points.add(point);

        return points;

    }
}
