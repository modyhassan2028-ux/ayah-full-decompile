package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f22007n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22013f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22015i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f22016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f22018m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22007n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(k kVar) {
        this.f22008a = kVar.f22008a;
        this.f22009b = kVar.f22009b;
        this.f22010c = kVar.f22010c;
        this.f22011d = kVar.f22011d;
        this.f22012e = kVar.f22012e;
        this.f22013f = kVar.f22013f;
        this.g = kVar.g;
        this.f22014h = kVar.f22014h;
        this.f22015i = kVar.f22015i;
        this.j = kVar.j;
        this.f22016k = kVar.f22016k;
        this.f22017l = kVar.f22017l;
        this.f22018m = kVar.f22018m;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22053s);
        this.f22008a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f22007n.get(index)) {
                case 1:
                    this.f22009b = typedArrayObtainStyledAttributes.getFloat(index, this.f22009b);
                    break;
                case 2:
                    this.f22010c = typedArrayObtainStyledAttributes.getFloat(index, this.f22010c);
                    break;
                case 3:
                    this.f22011d = typedArrayObtainStyledAttributes.getFloat(index, this.f22011d);
                    break;
                case 4:
                    this.f22012e = typedArrayObtainStyledAttributes.getFloat(index, this.f22012e);
                    break;
                case 5:
                    this.f22013f = typedArrayObtainStyledAttributes.getFloat(index, this.f22013f);
                    break;
                case 6:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 7:
                    this.f22014h = typedArrayObtainStyledAttributes.getDimension(index, this.f22014h);
                    break;
                case 8:
                    this.f22015i = typedArrayObtainStyledAttributes.getDimension(index, this.f22015i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f22016k = typedArrayObtainStyledAttributes.getDimension(index, this.f22016k);
                    break;
                case 11:
                    this.f22017l = true;
                    this.f22018m = typedArrayObtainStyledAttributes.getDimension(index, this.f22018m);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
