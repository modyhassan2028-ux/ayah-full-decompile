package M7;

import H7.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5757f;
    public int g;

    public d(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f5754c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        H.c(context, attributeSet, i10, i11);
        int[] iArr = p128m7.a.f19660d;
        H.d(context, attributeSet, iArr, i10, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        this.f5752a = va.g.y(context, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        this.f5753b = Math.min(va.g.y(context, typedArrayObtainStyledAttributes, 8, 0), this.f5752a / 2);
        this.f5756e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f5757f = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f5754c = new int[]{Y2.a.C(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f5754c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f5754c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f5755d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            this.f5755d = this.f5754c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f3 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f5755d = Y2.a.t(this.f5755d, (int) (f3 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
