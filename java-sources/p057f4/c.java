package p057f4;

import K9.AbstractC0405x;
import K9.H;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import R9.d;
import R9.e;
import U6.C0532j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ayah.R;
import p046e4.a;
import p046e4.b;
import p151p.C1256n;
import p218w3.f;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BitmapFactory.Options f16203e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1256n f16204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4.c f16206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L5.c f16207d;

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ALPHA_8;
        f16203e = options;
    }

    public c(C1256n c1256n, f fVar, C0532j c0532j, X4.c cVar, L5.c cVar2) {
        j.e(fVar, "pageModel");
        this.f16204a = c1256n;
        this.f16205b = fVar;
        this.f16206c = cVar;
        this.f16207d = cVar2;
    }

    public static Object a(c cVar, Context context, int i10, int i11, int i12, boolean z10, i iVar, int i13) {
        boolean z11 = (i13 & 32) != 0;
        a aVar = b.f15760a;
        cVar.getClass();
        e eVar = H.f5322a;
        return AbstractC0405x.I(d.f7436t, new a(cVar, i10, i11, i12, context, aVar, z10, z11, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, q9.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f16202u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16202u = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objP = bVar.f16200s;
        int i11 = bVar.f16202u;
        if (i11 == 0) {
            p110k9.a.e(objP);
            InterfaceC0415h interfaceC0415h = this.f16205b.f23666b.f4313h;
            bVar.f16199r = context;
            bVar.f16202u = 1;
            objP = AbstractC0419l.p(interfaceC0415h, bVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = bVar.f16199r;
            p110k9.a.e(objP);
        }
        return new Integer(context.getColor(((Boolean) objP).booleanValue() ? R.color.quran_background_black : R.color.quran_background));
    }
}
