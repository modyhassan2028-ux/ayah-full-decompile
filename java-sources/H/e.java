package H;

import A.C0025j;
import A.C0030l0;
import A.C0039q;
import D0.C0086d;
import J0.j0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import U6.C0532j;
import Z0.B;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.Serializable;
import java.util.ArrayList;
import p110k9.y;
import p120l9.n;
import p244z1.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3120r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Serializable f3125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, j0 j0Var, C0086d c0086d, C0025j c0025j, p150o9.c cVar) {
        super(2, cVar);
        this.f3122t = fVar;
        this.f3123u = j0Var;
        this.f3124v = c0086d;
        this.f3125w = c0025j;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f3120r) {
            case 0:
                e eVar = new e((f) this.f3122t, (j0) this.f3123u, (C0086d) this.f3124v, (C0025j) this.f3125w, cVar);
                eVar.f3121s = obj;
                return eVar;
            default:
                return new e((Context) this.f3121s, (p046e4.a) this.f3122t, (ArrayList) this.f3123u, (B) this.f3124v, (String) this.f3125w, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f3120r) {
            case 0:
                break;
        }
        return ((e) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f3120r;
        Serializable serializable = this.f3125w;
        Object obj2 = this.f3124v;
        Object obj3 = this.f3123u;
        Object obj4 = this.f3122t;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f3121s;
                f fVar = (f) obj4;
                p150o9.c cVar = null;
                AbstractC0405x.x(interfaceC0402u, null, new C0039q(fVar, (j0) obj3, (C0086d) obj2, cVar, 11), 3);
                return AbstractC0405x.x(interfaceC0402u, null, new C0030l0(fVar, (C0025j) serializable, cVar, 11), 3);
            default:
                p110k9.a.e(obj);
                Context context = (Context) this.f3121s;
                float f3 = context.getResources().getDisplayMetrics().density;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(14 * f3);
                Resources resources = context.getResources();
                ThreadLocal threadLocal = j.f24770a;
                textPaint.setColor(resources.getColor(R.color.secondary_text, null));
                Typeface typeface = Typeface.DEFAULT;
                textPaint.setTypeface(typeface);
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setTextSize(17 * f3);
                textPaint2.setColor(context.getResources().getColor(R.color.text, null));
                textPaint2.setTypeface(typeface);
                float f7 = 16 * f3;
                float f10 = 15 * f3;
                ((p046e4.a) obj4).getClass();
                float f11 = 1440;
                float f12 = 4;
                int i11 = (int) (f11 - (f12 * f10));
                ArrayList arrayList = (ArrayList) obj3;
                C0532j c0532j = (C0532j) ((B) obj2).f10875s;
                ArrayList arrayList2 = new ArrayList(n.a0(arrayList, 10));
                int size = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Serializable serializable2 = serializable;
                    p066g4.a aVar = (p066g4.a) obj5;
                    arrayList2.add(C0532j.o(c0532j, new p106k4.a().a(context, aVar.f16290a, aVar.f16291b, aVar.f16292c), textPaint2, i11, 8));
                    arrayList = arrayList;
                    serializable = serializable2;
                    size = size;
                    f3 = f3;
                }
                Serializable serializable3 = serializable;
                float f13 = f3;
                float f14 = f12 * f13;
                int i14 = (int) f14;
                int size2 = arrayList2.size();
                int height = 0;
                int i15 = 0;
                while (i15 < size2) {
                    Object obj6 = arrayList2.get(i15);
                    i15++;
                    height += ((StaticLayout) obj6).getHeight();
                }
                int size3 = ((arrayList2.size() - 1) * i14) + height;
                StaticLayout staticLayoutO = C0532j.o(c0532j, (String) serializable3, textPaint, i11, 24);
                int i16 = (int) (10 * f13);
                int height2 = staticLayoutO.getHeight() + i16 + size3 + ((int) (f12 * f7));
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1440, height2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColor(context.getResources().getColor(R.color.quran_highlight, null));
                canvas.translate(25 * f13, f7);
                staticLayoutO.draw(canvas);
                canvas.translate((-25) * f13, -f7);
                float f15 = i16;
                canvas.drawRoundRect(f10, f7 + f15 + staticLayoutO.getHeight(), f11 - f10, height2 - f7, f14, f14, paint);
                float f16 = 2;
                float height3 = (f7 * f16) + f15 + staticLayoutO.getHeight();
                int size4 = arrayList2.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj7 = arrayList2.get(i17);
                    i17++;
                    int i18 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC0813f2.T();
                        throw null;
                    }
                    StaticLayout staticLayout = (StaticLayout) obj7;
                    if (i12 > 0) {
                        height3 += i14;
                    }
                    canvas.translate(f16 * f10, height3);
                    staticLayout.draw(canvas);
                    canvas.translate((-2) * f10, -height3);
                    height3 += staticLayout.getHeight();
                    i12 = i18;
                }
                return bitmapCreateBitmap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, p046e4.a aVar, ArrayList arrayList, B b5, String str, p150o9.c cVar) {
        super(2, cVar);
        this.f3121s = context;
        this.f3122t = aVar;
        this.f3123u = arrayList;
        this.f3124v = b5;
        this.f3125w = str;
    }
}
