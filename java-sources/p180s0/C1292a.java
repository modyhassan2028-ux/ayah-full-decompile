package p180s0;

import B6.d;
import R7.C0479a;
import R7.C0481c;
import R7.InterfaceC0482d;
import R7.n;
import com.google.android.material.carousel.MaskableFrameLayout;
import io.realm.RealmFieldTypeConstants;
import java.nio.charset.Charset;
import p185s8.O0;
import p187t0.i;
import p223x.InterfaceC1433w;
import w8.a;

/* JADX INFO: renamed from: s0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1292a implements i, n, d, InterfaceC1433w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21817r;

    public /* synthetic */ C1292a(int i10) {
        this.f21817r = i10;
    }

    @Override // p223x.InterfaceC1433w
    public float a(float f3) {
        return f3;
    }

    @Override // B6.d
    public Object apply(Object obj) {
        a.f23792b.getClass();
        return p194t8.a.f22646a.D((O0) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p187t0.i
    public double b(double d5) {
        switch (this.f21817r) {
            case 10:
                double d9 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d9 >= 0.0031308049535603718d ? (Math.pow(d9, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d9 / 0.07739938080495357d, d5);
            case 11:
                double d10 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d10 >= 0.04045d ? Math.pow((0.9478672985781991d * d10) + 0.05213270142180095d, 2.4d) : d10 * 0.07739938080495357d, d5);
            case 12:
                float[] fArr = p187t0.d.f22513a;
                return p187t0.d.b(p187t0.d.f22515c, d5);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                float[] fArr2 = p187t0.d.f22513a;
                return p187t0.d.a(p187t0.d.f22515c, d5);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                float[] fArr3 = p187t0.d.f22513a;
                return p187t0.d.d(p187t0.d.f22516d, d5);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                float[] fArr4 = p187t0.d.f22513a;
                return p187t0.d.c(p187t0.d.f22516d, d5);
            default:
                return d5;
        }
    }

    @Override // R7.n
    public InterfaceC0482d c(InterfaceC0482d interfaceC0482d) {
        int i10 = MaskableFrameLayout.f14762w;
        return interfaceC0482d instanceof C0479a ? new C0481c(((C0479a) interfaceC0482d).f7287a) : interfaceC0482d;
    }
}
