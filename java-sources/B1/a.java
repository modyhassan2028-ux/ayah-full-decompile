package B1;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor c(Context context) {
        return context.getMainExecutor();
    }

    public static int d(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String e(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params k(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int l(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri m(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void n(View view) {
        view.resetPivot();
    }

    public static void o(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void p(ViewStructure viewStructure, int i10) {
        viewStructure.setMaxTextLength(i10);
    }

    public static void q(int i10, View view) {
        view.setOutlineAmbientShadowColor(i10);
    }

    public static void r(int i10, View view) {
        view.setOutlineSpotShadowColor(i10);
    }

    public static boolean s(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
