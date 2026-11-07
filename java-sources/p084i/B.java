package p084i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f16498b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f16499c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f16500d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f16501e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f16502f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O f16503h = new O(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f16504a = new Object[2];

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        O o10 = f16503h;
        Constructor constructor = (Constructor) o10.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f16498b);
            o10.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f16504a);
    }
}
