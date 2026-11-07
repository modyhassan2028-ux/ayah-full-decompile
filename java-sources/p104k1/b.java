package p104k1;

import F9.f;
import R0.j;
import R0.s;
import R0.u;
import androidx.compose.ui.window.PopupLayout;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f18896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f18897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f18898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f18899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f18900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f18901x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18902r;

    static {
        int i10 = 1;
        f18896s = new b(i10, 0);
        f18897t = new b(i10, 1);
        f18898u = new b(i10, 2);
        f18899v = new b(i10, 3);
        f18900w = new b(i10, 4);
        f18901x = new b(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f18902r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f18902r;
        y yVar = y.f19095a;
        switch (i10) {
            case 0:
                f[] fVarArr = u.f7181a;
                ((j) obj).e(s.f7175v, yVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                f[] fVarArr2 = u.f7181a;
                ((j) obj).e(s.f7174u, yVar);
                break;
            case 4:
                break;
            default:
                PopupLayout popupLayout = (PopupLayout) obj;
                if (popupLayout.isAttachedToWindow()) {
                    popupLayout.l();
                }
                break;
        }
        return yVar;
    }
}
