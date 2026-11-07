package M0;

import A.C0041r0;
import O.L;
import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p151p.m1;
import p171r0.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f5661a;

    public a(m1 m1Var) {
        this.f5661a = m1Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        m1 m1Var = this.f5661a;
        m1Var.getClass();
        j.b(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            p241y9.a aVar = (p241y9.a) m1Var.f20742c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            L l10 = (L) m1Var.f20743d;
            if (l10 != null) {
                l10.invoke();
            }
        } else if (itemId == 2) {
            p241y9.a aVar2 = (p241y9.a) m1Var.f20744e;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 3) {
            L l11 = (L) m1Var.f20745f;
            if (l11 != null) {
                l11.invoke();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            L l12 = (L) m1Var.g;
            if (l12 != null) {
                l12.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        m1 m1Var = this.f5661a;
        m1Var.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((p241y9.a) m1Var.f20742c) != null) {
            m1.b(menu, b.Copy);
        }
        if (((L) m1Var.f20743d) != null) {
            m1.b(menu, b.Paste);
        }
        if (((p241y9.a) m1Var.f20744e) != null) {
            m1.b(menu, b.Cut);
        }
        if (((L) m1Var.f20745f) != null) {
            m1.b(menu, b.SelectAll);
        }
        if (((L) m1Var.g) == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        m1.b(menu, b.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C0041r0) this.f5661a.f20740a).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        e eVar = (e) this.f5661a.f20741b;
        if (rect != null) {
            rect.set((int) eVar.f21389a, (int) eVar.f21390b, (int) eVar.f21391c, (int) eVar.f21392d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        m1 m1Var = this.f5661a;
        m1Var.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        m1.c(menu, b.Copy, (p241y9.a) m1Var.f20742c);
        m1.c(menu, b.Paste, (L) m1Var.f20743d);
        m1.c(menu, b.Cut, (p241y9.a) m1Var.f20744e);
        m1.c(menu, b.SelectAll, (L) m1Var.f20745f);
        m1.c(menu, b.Autofill, (L) m1Var.g);
        return true;
    }
}
