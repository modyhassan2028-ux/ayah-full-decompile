package Q7;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f6869i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f6870k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f6871l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6877f;
    public final Path g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f6878h;

    public a() {
        Paint paint = new Paint();
        this.f6878h = paint;
        this.f6872a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f6873b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f6874c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f6875d = A1.a.e(i10, 68);
        this.f6876e = A1.a.e(i10, 20);
        this.f6877f = A1.a.e(i10, 0);
        this.f6872a.setColor(this.f6875d);
    }
}
