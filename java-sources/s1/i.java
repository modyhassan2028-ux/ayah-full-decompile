package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f21995h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22001f;
    public float g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21995h = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(i iVar) {
        this.f21996a = iVar.f21996a;
        this.f21997b = iVar.f21997b;
        this.f21998c = iVar.f21998c;
        this.f21999d = iVar.f21999d;
        this.f22000e = iVar.f22000e;
        this.g = iVar.g;
        this.f22001f = iVar.f22001f;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22044i);
        this.f21996a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f21995h.get(index)) {
                case 1:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 2:
                    this.f21999d = typedArrayObtainStyledAttributes.getInt(index, this.f21999d);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f21998c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f21998c = m1.e.f19501c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f22000e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f21997b = l.j(typedArrayObtainStyledAttributes, index, this.f21997b);
                    break;
                case 6:
                    this.f22001f = typedArrayObtainStyledAttributes.getFloat(index, this.f22001f);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
