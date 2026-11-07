package p158p6;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.ayah.PreferencesActivity;
import com.ayah.ui.PreferencesFragment;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PreferencesFragment f21001s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PreferencesFragment preferencesFragment, c cVar, int i10) {
        super(2, cVar);
        this.f21000r = i10;
        this.f21001s = preferencesFragment;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f21000r) {
            case 0:
                return new b(this.f21001s, cVar, 0);
            default:
                return new b(this.f21001s, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21000r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        c cVar = (c) obj2;
        switch (i10) {
            case 0:
                b bVar = (b) create(bool, cVar);
                y yVar = y.f19095a;
                bVar.invokeSuspend(yVar);
                return yVar;
            default:
                b bVar2 = (b) create(bool, cVar);
                y yVar2 = y.f19095a;
                bVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21000r;
        y yVar = y.f19095a;
        PreferencesFragment preferencesFragment = this.f21001s;
        switch (i10) {
            case 0:
                a.e(obj);
                preferencesFragment.f13940D0 = true;
                break;
            default:
                a.e(obj);
                FragmentActivity fragmentActivityL = preferencesFragment.L();
                if (fragmentActivityL instanceof PreferencesActivity) {
                    PreferencesActivity preferencesActivity = (PreferencesActivity) fragmentActivityL;
                    Intent intent = preferencesActivity.getIntent();
                    intent.addFlags(33554432);
                    preferencesActivity.startActivity(intent);
                    preferencesActivity.finish();
                }
                break;
        }
        return yVar;
    }
}
