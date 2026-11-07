package p078h4;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import L5.c;
import R9.d;
import Y3.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.ayah.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p120l9.v;
import p124m3.j;
import p124m3.k;
import p124m3.l;
import p127m6.b;
import p151p.C1256n;
import p181s2.o;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f16451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f16454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f16455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f16456x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10, int i11, int i12, int i13, Context context, p150o9.c cVar2) {
        super(2, cVar2);
        this.f16451s = cVar;
        this.f16452t = i10;
        this.f16453u = i11;
        this.f16454v = i12;
        this.f16455w = i13;
        this.f16456x = context;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new a(this.f16451s, this.f16452t, this.f16453u, this.f16454v, this.f16455w, this.f16456x, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0183  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objI;
        j jVar;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        boolean z10;
        float f3;
        int i10;
        p046e4.a aVar;
        InputStream inputStream3;
        Throwable th2;
        c cVar = this.f16451s;
        p046e4.a aVar2 = (p046e4.a) cVar.f5533t;
        int i11 = this.f16450r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            C1256n c1256n = (C1256n) cVar.f5532s;
            this.f16450r = 1;
            R9.e eVar = H.f5322a;
            objI = AbstractC0405x.I(d.f7436t, new b(this.f16452t, this.f16453u, this.f16454v, c1256n, null), this);
            p161p9.a aVar3 = p161p9.a.f21156r;
            if (objI == aVar3) {
                return aVar3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            objI = obj;
        }
        List list = (List) objI;
        j jVar2 = (j) m.f0(list);
        int iC = jVar2.c();
        j jVar3 = (j) m.m0(list);
        int iC2 = jVar3.c();
        k kVar = (k) m.f0(jVar2.a());
        k kVar2 = (k) m.m0(jVar3.a());
        int i12 = (((iC2 - iC) * 15) - ((k) m.f0(((j) m.f0(list)).a())).f19605a) + ((k) m.m0(((j) m.m0(list)).a())).f19605a;
        aVar2.getClass();
        int i13 = aVar2.f15758a;
        int i14 = this.f16455w;
        int i15 = (i12 * i14) + i13;
        Context context = this.f16456x;
        int color = context.getColor(R.color.quran_text);
        Paint paint = new Paint(7);
        paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), 2131231033);
        aVar2.getClass();
        float f7 = 1440;
        int iV = B9.a.V(0.05f * f7);
        int height = (bitmapDecodeResource.getHeight() * iV) / bitmapDecodeResource.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1440, i15, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Iterator it = new E9.d(iC, iC2, 1).iterator();
        int i16 = 0;
        while (((E9.c) it).f2000t) {
            int iNextInt = ((v) it).nextInt();
            Iterator it2 = it;
            j jVar4 = jVar2;
            int i17 = i16;
            int i18 = 0;
            while (i18 < 15) {
                if ((iNextInt != iC || i18 >= kVar.f19605a) && ((iNextInt != iC2 || i18 <= kVar2.f19605a) && (iNextInt != 2 || i18 <= 11))) {
                    jVar = jVar3;
                    InputStream inputStreamOpen = context.getAssets().open("quran-images/" + iNextInt + "/" + (i18 + 1) + ".png");
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, p057f4.c.f16203e);
                        if (bitmapDecodeStream != null) {
                            try {
                                if (iNextInt == jVar4.c()) {
                                    try {
                                        if (i18 != kVar.f19605a || kVar.f19607c >= 1.0f) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = inputStreamOpen;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            o.e(inputStream, th);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    z10 = false;
                                }
                                float f10 = 0.0f;
                                boolean z11 = iNextInt == jVar.c() && i18 == kVar2.f19605a && kVar2.f19606b > 0.0f;
                                if (z10) {
                                    float f11 = 1 - kVar.f19607c;
                                    aVar2.getClass();
                                    f10 = (((f11 * f7) / 2) - aVar2.f15759b) + 0.0f;
                                }
                                if (z11 != 0) {
                                    float f12 = kVar2.f19606b;
                                    aVar2.getClass();
                                    f10 = (-((f12 * f7) / 2)) + aVar2.f15759b + f10;
                                }
                                float f13 = f10;
                                ArrayList arrayList = new ArrayList();
                                if (z10) {
                                    f3 = f7;
                                    float f14 = kVar.f19607c;
                                    aVar2.getClass();
                                    inputStream2 = inputStreamOpen;
                                    try {
                                        arrayList.add(new Rect(0, i17, (int) ((f14 * f3) + (iV / 2) + f13), i17 + bitmapDecodeStream.getHeight()));
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        inputStream = inputStream2;
                                        throw th;
                                    }
                                } else {
                                    inputStream2 = inputStreamOpen;
                                    f3 = f7;
                                }
                                if (z11) {
                                    float f15 = kVar2.f19606b;
                                    aVar2.getClass();
                                    arrayList.add(new Rect((int) ((f15 * f3) + (iV / 2) + f13), i17, bitmapDecodeStream.getWidth(), i17 + bitmapDecodeStream.getHeight()));
                                }
                                int iSave = canvas.save();
                                try {
                                    int size = arrayList.size();
                                    int i19 = 0;
                                    while (i19 < size) {
                                        Object obj2 = arrayList.get(i19);
                                        i19++;
                                        canvas.clipRect((Rect) obj2);
                                    }
                                    float f16 = i17;
                                    canvas.drawBitmap(bitmapDecodeStream, f13, f16, paint);
                                    canvas.restoreToCount(iSave);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : list) {
                                        j jVar5 = (j) obj3;
                                        if (jVar5.c() == iNextInt && jVar5.b().f19609b == i18) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    int size2 = arrayList2.size();
                                    int i20 = 0;
                                    while (i20 < size2) {
                                        Object obj4 = arrayList2.get(i20);
                                        i20++;
                                        j jVar6 = (j) obj4;
                                        l lVarB = jVar6.b();
                                        int i21 = i17;
                                        float f17 = lVarB.f19610c;
                                        aVar2.getClass();
                                        int iV2 = B9.a.V(((f17 * f3) + f13) - (iV / 2));
                                        int i22 = i18;
                                        int iV3 = B9.a.V(((lVarB.f19611d * aVar2.f15758a) + f16) - (height / 2));
                                        Y3.m mVar = new Y3.m(context, jVar6, new t(16));
                                        mVar.a(height);
                                        mVar.setBounds(iV2, iV3, iV2 + iV, iV3 + height);
                                        mVar.draw(canvas);
                                        i17 = i21;
                                        i18 = i22;
                                        aVar2 = aVar2;
                                        arrayList2 = arrayList2;
                                    }
                                    i10 = i18;
                                    aVar = aVar2;
                                    i17 += i14;
                                    inputStream3 = inputStream2;
                                    th2 = null;
                                } catch (Throwable th6) {
                                    canvas.restoreToCount(iSave);
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                inputStream2 = inputStreamOpen;
                            }
                        } else {
                            i10 = i18;
                            aVar = aVar2;
                            kVar = kVar;
                            f3 = f7;
                            i14 = i14;
                            inputStream3 = inputStreamOpen;
                            th2 = null;
                        }
                        o.e(inputStream3, th2);
                    } catch (Throwable th8) {
                        inputStream = inputStreamOpen;
                        th = th8;
                    }
                } else {
                    i10 = i18;
                    aVar = aVar2;
                    jVar = jVar3;
                    kVar = kVar;
                    f3 = f7;
                    i14 = i14;
                }
                i18 = i10 + 1;
                f7 = f3;
                kVar = kVar;
                iC = iC;
                jVar3 = jVar;
                iC2 = iC2;
                i14 = i14;
                aVar2 = aVar;
            }
            jVar2 = jVar4;
            i16 = i17;
            it = it2;
        }
        return bitmapCreateBitmap;
    }
}
