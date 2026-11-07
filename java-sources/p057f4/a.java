package p057f4;

import A4.l;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p124m3.j;
import p127m6.b;
import p150o9.c;
import p151p.C1256n;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f16183A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f16184B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f16185C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Context f16186D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ p046e4.a f16187E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ boolean f16188F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ boolean f16189G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f16190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f16191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f16192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16197y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f16198z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10, int i11, int i12, Context context, p046e4.a aVar, boolean z10, boolean z11, c cVar2) {
        super(2, cVar2);
        this.f16198z = cVar;
        this.f16183A = i10;
        this.f16184B = i11;
        this.f16185C = i12;
        this.f16186D = context;
        this.f16187E = aVar;
        this.f16188F = z10;
        this.f16189G = z11;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        return new a(this.f16198z, this.f16183A, this.f16184B, this.f16185C, this.f16186D, this.f16187E, this.f16188F, this.f16189G, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p161p9.a aVar;
        Object objI;
        Object objI2;
        int i10;
        Bitmap bitmap;
        p161p9.a aVar2;
        int i11;
        Object objI3;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Object objI4;
        Bitmap bitmap5;
        int iU;
        int height;
        int i12;
        Object objB;
        int i13;
        Bitmap bitmap6;
        int i14;
        Paint paint;
        Canvas canvas;
        float f3;
        int height2;
        int i15 = this.f16197y;
        Context context = this.f16186D;
        int i16 = this.f16184B;
        int i17 = this.f16183A;
        int i18 = 4;
        p046e4.a aVar3 = this.f16187E;
        c cVar = this.f16198z;
        p161p9.a aVar4 = p161p9.a.f21156r;
        if (i15 == 0) {
            p110k9.a.e(obj);
            C1256n c1256n = cVar.f16204a;
            this.f16197y = 1;
            R9.e eVar = H.f5322a;
            aVar = aVar4;
            objI = AbstractC0405x.I(d.f7436t, new b(i17, i16, this.f16185C, c1256n, null), this);
            if (objI != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            p110k9.a.e(obj);
            objI = obj;
            aVar = aVar4;
        } else if (i15 == 2) {
            int i19 = this.f16193u;
            p110k9.a.e(obj);
            i10 = i19;
            aVar = aVar4;
            objI2 = obj;
            bitmap = (Bitmap) objI2;
            L5.c cVar2 = new L5.c(cVar.f16204a, aVar3);
            this.f16190r = bitmap;
            this.f16193u = i10 == true ? 1 : 0;
            this.f16197y = 3;
            int iU2 = B9.a.U(((double) aVar3.f15758a) * 0.75d);
            R9.e eVar2 = H.f5322a;
            d dVar = d.f7436t;
            aVar2 = aVar;
            i11 = 5;
            p078h4.a aVar5 = new p078h4.a(cVar2, this.f16183A, this.f16184B, this.f16185C, iU2, context, null);
            context = context;
            objI3 = AbstractC0405x.I(dVar, aVar5, this);
            if (objI3 == aVar2) {
                return aVar2;
            }
            bitmap2 = bitmap;
            bitmap3 = (Bitmap) objI3;
            if (this.f16188F) {
                X4.c cVar3 = cVar.f16206c;
                this.f16190r = bitmap2;
                this.f16191s = bitmap3;
                this.f16193u = i10 == true ? 1 : 0;
                this.f16197y = i18;
                R9.e eVar3 = H.f5322a;
                objI4 = AbstractC0405x.I(d.f7436t, new l(context, aVar3, cVar3, (c) null), this);
                if (objI4 == aVar2) {
                    return aVar2;
                }
                bitmap4 = (Bitmap) objI4;
            } else {
                bitmap4 = null;
            }
            bitmap5 = bitmap2;
            if (this.f16189G) {
                aVar3.getClass();
                iU = B9.a.U(((double) 1440) * 0.041666666666666664d);
            } else {
                iU = 0;
            }
            int i20 = iU * 2;
            height = bitmap3.getHeight() + bitmap5.getHeight() + (bitmap4 != null ? bitmap4.getHeight() : 0) + i20;
            aVar3.getClass();
            i12 = 1440 + i20;
            this.f16190r = bitmap5;
            this.f16191s = bitmap3;
            this.f16192t = bitmap4;
            this.f16193u = i10;
            this.f16194v = iU;
            this.f16195w = height;
            this.f16196x = i12;
            this.f16197y = i11;
            objB = cVar.b(context, this);
            if (objB == aVar2) {
                return aVar2;
            }
            i13 = i12;
            bitmap6 = bitmap3;
            i14 = height;
        } else if (i15 == 3) {
            int i21 = this.f16193u;
            bitmap2 = this.f16190r;
            p110k9.a.e(obj);
            i10 = i21;
            i18 = 4;
            cVar = cVar;
            i11 = 5;
            aVar2 = aVar4;
            objI3 = obj;
            aVar3 = aVar3;
            bitmap3 = (Bitmap) objI3;
            if (this.f16188F) {
                X4.c cVar4 = cVar.f16206c;
                this.f16190r = bitmap2;
                this.f16191s = bitmap3;
                this.f16193u = i10 == true ? 1 : 0;
                this.f16197y = i18;
                R9.e eVar4 = H.f5322a;
                objI4 = AbstractC0405x.I(d.f7436t, new l(context, aVar3, cVar4, (c) null), this);
                if (objI4 == aVar2) {
                    return aVar2;
                }
                bitmap4 = (Bitmap) objI4;
            } else {
                bitmap4 = null;
            }
            bitmap5 = bitmap2;
            if (this.f16189G) {
                aVar3.getClass();
                iU = B9.a.U(((double) 1440) * 0.041666666666666664d);
            } else {
                iU = 0;
            }
            int i22 = iU * 2;
            height = bitmap3.getHeight() + bitmap5.getHeight() + (bitmap4 != null ? bitmap4.getHeight() : 0) + i22;
            aVar3.getClass();
            i12 = 1440 + i22;
            this.f16190r = bitmap5;
            this.f16191s = bitmap3;
            this.f16192t = bitmap4;
            this.f16193u = i10;
            this.f16194v = iU;
            this.f16195w = height;
            this.f16196x = i12;
            this.f16197y = i11;
            objB = cVar.b(context, this);
            if (objB == aVar2) {
                return aVar2;
            }
            i13 = i12;
            bitmap6 = bitmap3;
            i14 = height;
        } else if (i15 == 4) {
            int i23 = this.f16193u;
            bitmap3 = this.f16191s;
            bitmap2 = this.f16190r;
            p110k9.a.e(obj);
            i10 = i23;
            cVar = cVar;
            i11 = 5;
            aVar2 = aVar4;
            aVar3 = aVar3;
            objI4 = obj;
            bitmap4 = (Bitmap) objI4;
            bitmap5 = bitmap2;
            if (this.f16189G) {
                aVar3.getClass();
                iU = B9.a.U(((double) 1440) * 0.041666666666666664d);
            } else {
                iU = 0;
            }
            int i24 = iU * 2;
            height = bitmap3.getHeight() + bitmap5.getHeight() + (bitmap4 != null ? bitmap4.getHeight() : 0) + i24;
            aVar3.getClass();
            i12 = 1440 + i24;
            this.f16190r = bitmap5;
            this.f16191s = bitmap3;
            this.f16192t = bitmap4;
            this.f16193u = i10;
            this.f16194v = iU;
            this.f16195w = height;
            this.f16196x = i12;
            this.f16197y = i11;
            objB = cVar.b(context, this);
            if (objB == aVar2) {
                return aVar2;
            }
            i13 = i12;
            bitmap6 = bitmap3;
            i14 = height;
        } else {
            if (i15 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f16196x;
            i14 = this.f16195w;
            iU = this.f16194v;
            Bitmap bitmap7 = this.f16192t;
            Bitmap bitmap8 = this.f16191s;
            bitmap5 = this.f16190r;
            p110k9.a.e(obj);
            bitmap6 = bitmap8;
            bitmap4 = bitmap7;
            objB = obj;
        }
        int iIntValue = ((Number) objB).intValue();
        paint = new Paint(2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(iIntValue);
        f3 = iU;
        canvas.drawBitmap(bitmap5, f3, f3, paint);
        int height3 = bitmap5.getHeight() + iU;
        canvas.drawBitmap(bitmap6, f3, height3, paint);
        height2 = bitmap6.getHeight() + height3;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, f3, ((canvas.getHeight() - bitmap4.getHeight()) - (((canvas.getHeight() - height2) - bitmap4.getHeight()) / 2.0f)) + 9, paint);
        }
        return bitmapCreateBitmap;
        j jVar = (j) m.f0((List) objI);
        int i25 = (i16 != 1 || i17 == 1 || i17 == 9) ? 0 : 1;
        L5.c cVar5 = cVar.f16207d;
        int i26 = jVar.f19595m;
        this.f16193u = i25;
        this.f16197y = 2;
        R9.e eVar5 = H.f5322a;
        boolean z10 = i25;
        objI2 = AbstractC0405x.I(d.f7436t, new d(this.f16187E, context, cVar5, i26, z10, null), this);
        if (objI2 != aVar) {
            i10 = z10 ? 1 : 0;
            bitmap = (Bitmap) objI2;
            L5.c cVar6 = new L5.c(cVar.f16204a, aVar3);
            this.f16190r = bitmap;
            this.f16193u = i10 == true ? 1 : 0;
            this.f16197y = 3;
            int iU3 = B9.a.U(((double) aVar3.f15758a) * 0.75d);
            R9.e eVar6 = H.f5322a;
            d dVar2 = d.f7436t;
            aVar2 = aVar;
            i11 = 5;
            p078h4.a aVar6 = new p078h4.a(cVar6, this.f16183A, this.f16184B, this.f16185C, iU3, context, null);
            context = context;
            objI3 = AbstractC0405x.I(dVar2, aVar6, this);
            if (objI3 == aVar2) {
                return aVar2;
            }
            bitmap2 = bitmap;
            bitmap3 = (Bitmap) objI3;
            if (this.f16188F) {
                X4.c cVar7 = cVar.f16206c;
                this.f16190r = bitmap2;
                this.f16191s = bitmap3;
                this.f16193u = i10 == true ? 1 : 0;
                this.f16197y = i18;
                R9.e eVar7 = H.f5322a;
                objI4 = AbstractC0405x.I(d.f7436t, new l(context, aVar3, cVar7, (c) null), this);
                if (objI4 == aVar2) {
                    return aVar2;
                }
                bitmap4 = (Bitmap) objI4;
            } else {
                bitmap4 = null;
            }
            bitmap5 = bitmap2;
            if (this.f16189G) {
                aVar3.getClass();
                iU = B9.a.U(((double) 1440) * 0.041666666666666664d);
            } else {
                iU = 0;
            }
            int i27 = iU * 2;
            height = bitmap3.getHeight() + bitmap5.getHeight() + (bitmap4 != null ? bitmap4.getHeight() : 0) + i27;
            aVar3.getClass();
            i12 = 1440 + i27;
            this.f16190r = bitmap5;
            this.f16191s = bitmap3;
            this.f16192t = bitmap4;
            this.f16193u = i10;
            this.f16194v = iU;
            this.f16195w = height;
            this.f16196x = i12;
            this.f16197y = i11;
            objB = cVar.b(context, this);
            if (objB == aVar2) {
                return aVar2;
            }
            i13 = i12;
            bitmap6 = bitmap3;
            i14 = height;
            int iIntValue2 = ((Number) objB).intValue();
            paint = new Paint(2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(bitmapCreateBitmap2);
            canvas.drawColor(iIntValue2);
            f3 = iU;
            canvas.drawBitmap(bitmap5, f3, f3, paint);
            int height4 = bitmap5.getHeight() + iU;
            canvas.drawBitmap(bitmap6, f3, height4, paint);
            height2 = bitmap6.getHeight() + height4;
            if (bitmap4 != null) {
                canvas.drawBitmap(bitmap4, f3, ((canvas.getHeight() - bitmap4.getHeight()) - (((canvas.getHeight() - height2) - bitmap4.getHeight()) / 2.0f)) + 9, paint);
            }
            return bitmapCreateBitmap2;
        }
        return aVar;
    }
}
