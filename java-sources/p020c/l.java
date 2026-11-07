package p020c;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13394a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13395b = Color.argb(128, 27, 27, 27);

    public static void a(AppCompatActivity appCompatActivity) {
        u0 nVar;
        G g = G.f13362r;
        H h7 = new H(0, 0, g);
        H h10 = new H(f13394a, f13395b, g);
        View decorView = appCompatActivity.getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        j.d(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) g.e(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        j.d(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) g.e(resources2)).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            nVar = new q();
        } else if (i10 >= 29) {
            nVar = new p();
        } else if (i10 >= 28) {
            nVar = new o();
        } else {
            nVar = i10 >= 26 ? new n() : new m();
        }
        Window window = appCompatActivity.getWindow();
        j.d(window, "window");
        nVar.E(h7, h10, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = appCompatActivity.getWindow();
        j.d(window2, "window");
        nVar.d(window2);
    }
}
