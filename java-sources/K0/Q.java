package K0;

import K9.AbstractC0405x;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Q f4971A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Q f4972B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Q f4973C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Q f4974D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Q f4975E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Q f4976F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Q f4977G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Q f4978H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Q f4979I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Q f4980J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Q f4981K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Q f4982L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Q f4983M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Q f4984N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Q f4985O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Q f4986P;
    public static final Q Q;
    public static final Q R;
    public static final Q S;
    public static final Q T;
    public static final Q U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Q f4987V;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Q f4988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Q f4989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Q f4990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Q f4991v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Q f4992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Q f4993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Q f4994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Q f4995z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4996r;

    static {
        int i10 = 0;
        f4988s = new Q(i10, 0);
        f4989t = new Q(i10, 1);
        f4990u = new Q(i10, 2);
        f4991v = new Q(i10, 3);
        f4992w = new Q(i10, 4);
        f4993x = new Q(i10, 5);
        f4994y = new Q(i10, 6);
        f4995z = new Q(i10, 7);
        f4971A = new Q(i10, 8);
        f4972B = new Q(i10, 9);
        f4973C = new Q(i10, 10);
        f4974D = new Q(i10, 11);
        f4975E = new Q(i10, 12);
        f4976F = new Q(i10, 13);
        f4977G = new Q(i10, 14);
        f4978H = new Q(i10, 15);
        f4979I = new Q(i10, 16);
        f4980J = new Q(i10, 17);
        f4981K = new Q(i10, 18);
        f4982L = new Q(i10, 19);
        f4983M = new Q(i10, 20);
        f4984N = new Q(i10, 21);
        f4985O = new Q(i10, 22);
        f4986P = new Q(i10, 23);
        Q = new Q(i10, 24);
        R = new Q(i10, 25);
        S = new Q(i10, 26);
        T = new Q(i10, 27);
        U = new Q(i10, 28);
        f4987V = new Q(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i10, int i11) {
        super(i10);
        this.f4996r = i11;
    }

    @Override // p241y9.a
    public final Object invoke() {
        Choreographer choreographer;
        p150o9.c cVar = null;
        switch (this.f4996r) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    R9.e eVar = K9.H.f5322a;
                    choreographer = (Choreographer) AbstractC0405x.C(P9.n.f6798a, new F.x(2, cVar, 1));
                }
                Y y10 = new Y(choreographer, p185s8.u0.k(Looper.getMainLooper()));
                return Y2.a.Z(y10, y10.f5039C);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC0359n0.b("LocalAutofillManager");
                throw null;
            case 10:
                AbstractC0359n0.b("LocalAutofillTree");
                throw null;
            case 11:
                AbstractC0359n0.b("LocalClipboard");
                throw null;
            case 12:
                AbstractC0359n0.b("LocalClipboardManager");
                throw null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return Boolean.TRUE;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                AbstractC0359n0.b("LocalDensity");
                throw null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                AbstractC0359n0.b("LocalFocusManager");
                throw null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                AbstractC0359n0.b("LocalFontFamilyResolver");
                throw null;
            case 17:
                AbstractC0359n0.b("LocalFontLoader");
                throw null;
            case 18:
                AbstractC0359n0.b("LocalGraphicsContext");
                throw null;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                AbstractC0359n0.b("LocalHapticFeedback");
                throw null;
            case 20:
                AbstractC0359n0.b("LocalInputManager");
                throw null;
            case 21:
                AbstractC0359n0.b("LocalLayoutDirection");
                throw null;
            case 22:
                return null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case 26:
                AbstractC0359n0.b("LocalTextToolbar");
                throw null;
            case 27:
                AbstractC0359n0.b("LocalUriHandler");
                throw null;
            case 28:
                AbstractC0359n0.b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC0359n0.b("LocalWindowInfo");
                throw null;
        }
    }
}
