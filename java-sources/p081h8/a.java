package p081h8;

import F9.n;
import i7.I0;
import java.util.Arrays;
import p029c8.b;
import p029c8.d;
import p029c8.g;
import p029c8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f16464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f16465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f16466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f16467d;

    static {
        int i10 = g.f13552t;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f16464a = g.h(15, objArr);
        b bVar = d.f13545s;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        p017b7.g.Q(7, objArr2);
        f16465b = d.f(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        p017b7.g.Q(3, objArr3);
        f16466c = d.f(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        p017b7.g.Q(2, objArr4);
        f16467d = d.f(2, objArr4);
        n.l(4, "initialCapacity");
        String[] strArr = I0.f17010i;
        p017b7.g.Q(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], p000a.a.D(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = I0.j;
        p017b7.g.Q(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, p000a.a.D(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        d.f(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        p017b7.g.Q(2, objArr5);
        d.f(2, objArr5);
    }
}
