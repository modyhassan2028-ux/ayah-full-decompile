package m1;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f19500b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f19501c = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19502a = "identity";

    public static e c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        switch (str) {
            case "accelerate":
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new d("cubic(1, 1, 0, 0)");
            case "standard":
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Log.e("ConstraintSet", "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f19501c));
                return f19500b;
        }
    }

    public double b(double d5) {
        return 1.0d;
    }

    public final String toString() {
        return this.f19502a;
    }

    public double a(double d5) {
        return d5;
    }
}
