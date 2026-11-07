package H7;

import android.view.SubMenu;

/* JADX INFO: renamed from: H7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237k extends p140o.k {
    @Override // p140o.k, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        p140o.m mVarA = a(i10, i11, i12, charSequence);
        x xVar = new x(this.f20134a, this, mVarA);
        mVarA.f20174o = xVar;
        xVar.setHeaderTitle(mVarA.f20166e);
        return xVar;
    }
}
