package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22006e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22050p);
        this.f22002a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f22005d = typedArrayObtainStyledAttributes.getFloat(index, this.f22005d);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f22003b);
                this.f22003b = i11;
                this.f22003b = l.f22019d[i11];
            } else if (index == 4) {
                this.f22004c = typedArrayObtainStyledAttributes.getInt(index, this.f22004c);
            } else if (index == 3) {
                this.f22006e = typedArrayObtainStyledAttributes.getFloat(index, this.f22006e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
