package p094j1;

import K0.RunnableC0373v;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f18706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f18707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f18708u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f18709v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18710r;

    static {
        int i10 = 1;
        f18706s = new b(i10, 0);
        f18707t = new b(i10, 1);
        f18708u = new b(i10, 2);
        f18709v = new b(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f18710r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f18710r) {
            case 0:
                AndroidViewHolder androidViewHolder = (AndroidViewHolder) obj;
                androidViewHolder.getHandler().post(new RunnableC0373v(2, androidViewHolder.f12104H));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return y.f19095a;
    }
}
