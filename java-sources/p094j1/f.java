package p094j1;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import p110k9.y;
import p241y9.a;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f18723s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ViewFactoryHolder viewFactoryHolder, int i10) {
        super(0);
        this.f18722r = i10;
        this.f18723s = viewFactoryHolder;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f18722r) {
            case 0:
                this.f18723s.getLayoutNode().C();
                return y.f19095a;
            case 1:
                ViewFactoryHolder viewFactoryHolder = this.f18723s;
                if (viewFactoryHolder.f12117v && viewFactoryHolder.isAttachedToWindow() && viewFactoryHolder.getView().getParent() == viewFactoryHolder) {
                    viewFactoryHolder.getSnapshotObserver().a(viewFactoryHolder, b.f18706s, viewFactoryHolder.getUpdate());
                }
                return y.f19095a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f18723s.R.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                ViewFactoryHolder viewFactoryHolder2 = this.f18723s;
                viewFactoryHolder2.getReleaseBlock().e(viewFactoryHolder2.R);
                ViewFactoryHolder.n(viewFactoryHolder2);
                return y.f19095a;
            case 4:
                ViewFactoryHolder viewFactoryHolder3 = this.f18723s;
                viewFactoryHolder3.getResetBlock().e(viewFactoryHolder3.R);
                return y.f19095a;
            default:
                ViewFactoryHolder viewFactoryHolder4 = this.f18723s;
                viewFactoryHolder4.getUpdateBlock().e(viewFactoryHolder4.R);
                return y.f19095a;
        }
    }
}
