package p046e4;

import A4.l;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import Z0.B;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f15769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15770B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ a f15771C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Bitmap f15772D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f15773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f15774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f15775t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Paint f15776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f15780y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f15781z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Context context, String str, ArrayList arrayList, a aVar, Bitmap bitmap, c cVar) {
        super(2, cVar);
        this.f15780y = eVar;
        this.f15781z = context;
        this.f15769A = str;
        this.f15770B = arrayList;
        this.f15771C = aVar;
        this.f15772D = bitmap;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        return new d(this.f15780y, this.f15781z, this.f15769A, this.f15770B, this.f15771C, this.f15772D, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00cb  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Bitmap bitmap;
        Object objI2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        float f3;
        int height;
        Bitmap bitmapCreateBitmap;
        Paint paint;
        Object objB;
        Bitmap bitmap4;
        Paint paint2;
        Bitmap bitmap5;
        Bitmap bitmap6;
        int i10 = this.f15779x;
        a aVar = this.f15771C;
        Context context = this.f15781z;
        Bitmap bitmap7 = this.f15772D;
        e eVar = this.f15780y;
        a aVar2 = a.f21156r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            B b5 = eVar.f15784c;
            this.f15779x = 1;
            R9.e eVar2 = H.f5322a;
            objI = AbstractC0405x.I(R9.d.f7436t, new H.e(context, this.f15771C, this.f15770B, b5, this.f15769A, null), this);
            if (objI != aVar2) {
            }
            return aVar2;
        }
        if (i10 == 1) {
            p110k9.a.e(obj);
            objI = obj;
        } else {
            if (i10 == 2) {
                bitmap = this.f15773r;
                p110k9.a.e(obj);
                objI2 = obj;
                bitmap2 = bitmap;
                bitmap3 = (Bitmap) objI2;
                aVar.getClass();
                f3 = 0.041666668f * 1440;
                height = bitmap3.getHeight() + bitmap2.getHeight() + bitmap7.getHeight() + (B9.a.V(f3) * 2);
                bitmapCreateBitmap = Bitmap.createBitmap(B9.a.V(2 * f3) + bitmap7.getWidth(), height, Bitmap.Config.ARGB_8888);
                paint = new Paint(2);
                p057f4.c cVar = eVar.f15782a;
                this.f15773r = bitmap2;
                this.f15774s = bitmap3;
                this.f15775t = bitmapCreateBitmap;
                this.f15776u = paint;
                this.f15777v = f3;
                this.f15778w = height;
                this.f15779x = 3;
                objB = cVar.b(context, this);
                if (objB != aVar2) {
                    bitmap4 = bitmapCreateBitmap;
                    paint2 = paint;
                    bitmap5 = bitmap2;
                    bitmap6 = bitmap3;
                }
                return aVar2;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            height = this.f15778w;
            f3 = this.f15777v;
            paint2 = this.f15776u;
            Bitmap bitmap8 = this.f15775t;
            Bitmap bitmap9 = this.f15774s;
            Bitmap bitmap10 = this.f15773r;
            p110k9.a.e(obj);
            bitmap5 = bitmap10;
            bitmap6 = bitmap9;
            bitmap4 = bitmap8;
            objB = obj;
        }
        int iIntValue = ((Number) objB).intValue();
        Canvas canvas = new Canvas(bitmap4);
        canvas.drawColor(iIntValue);
        canvas.drawBitmap(bitmap7, f3, f3, paint2);
        canvas.drawBitmap(bitmap5, f3, bitmap7.getHeight() + f3, paint2);
        float height2 = bitmap5.getHeight() + bitmap7.getHeight() + f3;
        canvas.drawBitmap(bitmap6, f3, (((height - height2) - bitmap6.getHeight()) / 2.0f) + height2, paint2);
        return bitmap4;
        bitmap = (Bitmap) objI;
        X4.c cVar2 = eVar.f15783b;
        this.f15773r = bitmap;
        this.f15779x = 2;
        R9.e eVar3 = H.f5322a;
        objI2 = AbstractC0405x.I(R9.d.f7436t, new l(context, aVar, cVar2, (c) null), this);
        if (objI2 != aVar2) {
            bitmap2 = bitmap;
            bitmap3 = (Bitmap) objI2;
            aVar.getClass();
            f3 = 0.041666668f * 1440;
            height = bitmap3.getHeight() + bitmap2.getHeight() + bitmap7.getHeight() + (B9.a.V(f3) * 2);
            bitmapCreateBitmap = Bitmap.createBitmap(B9.a.V(2 * f3) + bitmap7.getWidth(), height, Bitmap.Config.ARGB_8888);
            paint = new Paint(2);
            p057f4.c cVar3 = eVar.f15782a;
            this.f15773r = bitmap2;
            this.f15774s = bitmap3;
            this.f15775t = bitmapCreateBitmap;
            this.f15776u = paint;
            this.f15777v = f3;
            this.f15778w = height;
            this.f15779x = 3;
            objB = cVar3.b(context, this);
            if (objB != aVar2) {
                bitmap4 = bitmapCreateBitmap;
                paint2 = paint;
                bitmap5 = bitmap2;
                bitmap6 = bitmap3;
                int iIntValue2 = ((Number) objB).intValue();
                Canvas canvas2 = new Canvas(bitmap4);
                canvas2.drawColor(iIntValue2);
                canvas2.drawBitmap(bitmap7, f3, f3, paint2);
                canvas2.drawBitmap(bitmap5, f3, bitmap7.getHeight() + f3, paint2);
                float height3 = bitmap5.getHeight() + bitmap7.getHeight() + f3;
                canvas2.drawBitmap(bitmap6, f3, (((height - height3) - bitmap6.getHeight()) / 2.0f) + height3, paint2);
                return bitmap4;
            }
        }
        return aVar2;
    }
}
