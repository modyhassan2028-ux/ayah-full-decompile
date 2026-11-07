package F7;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2421a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2422b;

    public a() {
        super(Matrix.class, "imageMatrixProperty");
        this.f2422b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2421a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(p137n7.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f14923W.getColorForState(extendedFloatingActionButton.getDrawableState(), ((b) this.f2422b).f2424b.f14923W.getDefaultColor()))));
            default:
                Matrix matrix = (Matrix) this.f2422b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2421a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f3 = (Float) obj2;
                int colorForState = extendedFloatingActionButton.f14923W.getColorForState(extendedFloatingActionButton.getDrawableState(), ((b) this.f2422b).f2424b.f14923W.getDefaultColor());
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (p137n7.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f3.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f3.floatValue() != 1.0f) {
                    extendedFloatingActionButton.f(colorStateListValueOf);
                } else {
                    extendedFloatingActionButton.f(extendedFloatingActionButton.f14923W);
                }
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f2422b = bVar;
    }
}
