package K7;

import android.content.Context;
import android.support.v4.media.session.p;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p140o.k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f5287A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f5288z;

    public e(Context context, Class cls, int i10) {
        super(context);
        this.f5288z = cls;
        this.f5287A = i10;
    }

    @Override // p140o.k
    public final p140o.m a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = this.f20139f.size() + 1;
        int i13 = this.f5287A;
        if (size <= i13) {
            y();
            p140o.m mVarA = super.a(i10, i11, i12, charSequence);
            mVarA.f(true);
            x();
            return mVarA;
        }
        String simpleName = this.f5288z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i13);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(p.B(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // p140o.k, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f5288z.getSimpleName().concat(" does not support submenus"));
    }
}
