package androidx.compose.ui.viewinterop;

import C0.d;
import J0.r0;
import Z.C0694m;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import p085i0.i;
import p085i0.j;
import p094j1.b;
import p094j1.f;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    public final View R;
    public final d S;
    public i T;
    public c U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public c f12124V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public c f12125W;

    public ViewFactoryHolder(Context context, c cVar, C0694m c0694m, j jVar, int i10, r0 r0Var) {
        View view = (View) cVar.e(context);
        d dVar = new d();
        super(context, c0694m, i10, dVar, view, r0Var);
        this.R = view;
        this.S = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objD = jVar != null ? jVar.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (jVar != null) {
            setSavableRegistryEntry(jVar.e(strValueOf, new f(this, 2)));
        }
        b bVar = b.f18709v;
        this.U = bVar;
        this.f12124V = bVar;
        this.f12125W = bVar;
    }

    public static final void n(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(i iVar) {
        i iVar2 = this.T;
        if (iVar2 != null) {
            ((p074h0.i) iVar2).M();
        }
        this.T = iVar;
    }

    public final d getDispatcher() {
        return this.S;
    }

    public final c getReleaseBlock() {
        return this.f12125W;
    }

    public final c getResetBlock() {
        return this.f12124V;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final c getUpdateBlock() {
        return this.U;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(c cVar) {
        this.f12125W = cVar;
        setRelease(new f(this, 3));
    }

    public final void setResetBlock(c cVar) {
        this.f12124V = cVar;
        setReset(new f(this, 4));
    }

    public final void setUpdateBlock(c cVar) {
        this.U = cVar;
        setUpdate(new f(this, 5));
    }
}
