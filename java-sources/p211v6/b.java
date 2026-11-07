package p211v6;

import D0.y;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import p074h0.i;
import p226x2.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23344s;

    public /* synthetic */ b(int i10, Object obj) {
        this.f23343r = i10;
        this.f23344s = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23343r) {
            case 0:
                ((i) this.f23344s).d();
                return;
            case 1:
                ((y) this.f23344s).d();
                return;
            case 2:
                ((EditTextPreferenceDialogFragmentCompat) this.f23344s).a0();
                return;
            case 3:
                RecyclerView recyclerView = ((PreferenceFragmentCompat) this.f23344s).f12779q0;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 4:
                synchronized (this) {
                    ((PreferenceGroup) this.f23344s).f12785d0.clear();
                    break;
                }
                return;
            default:
                ((p) this.f23344s).m();
                return;
        }
    }
}
