package V1;

import A.k1;
import D0.C0086d;
import T1.InterfaceC0488e;
import W1.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p110k9.o;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0488e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2.d f8405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f8409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f8410f;

    public c(Context context, String str, Set set, B2.d dVar, i iVar) {
        j.e(context, "context");
        j.e(str, "sharedPreferencesName");
        j.e(set, "keysToMigrate");
        C0086d c0086d = new C0086d(17, context, str);
        this.f8405a = dVar;
        this.f8406b = iVar;
        this.f8407c = context;
        this.f8408d = str;
        this.f8409e = p110k9.a.d(c0086d);
        this.f8410f = set == d.f8411a ? null : m.F0(set);
    }

    @Override // T1.InterfaceC0488e
    public final void a() throws IOException {
        Context context;
        String str;
        o oVar = this.f8409e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) oVar.getValue()).edit();
        Set set = this.f8410f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) oVar.getValue()).getAll().isEmpty() && (context = this.f8407c) != null && (str = this.f8408d) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                a.a(context, str);
            } else {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                File file2 = new File(file.getPath() + ".bak");
                file.delete();
                file2.delete();
            }
        }
        if (set != null) {
            set.clear();
        }
    }

    @Override // T1.InterfaceC0488e
    public final Object b(Object obj, k1 k1Var) {
        return this.f8406b.d(new e((SharedPreferences) this.f8409e.getValue(), this.f8410f), obj, k1Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // T1.InterfaceC0488e
    public final Object c(Object obj, p150o9.c cVar) throws IOException {
        b bVar;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f8404u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f8404u = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (q9.c) cVar);
            }
        } else {
            bVar = new b(this, (q9.c) cVar);
        }
        Object objInvoke = bVar.f8402s;
        int i11 = bVar.f8404u;
        boolean z10 = true;
        if (i11 == 0) {
            p110k9.a.e(objInvoke);
            bVar.f8401r = this;
            bVar.f8404u = 1;
            objInvoke = this.f8405a.invoke(obj, bVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = bVar.f8401r;
            p110k9.a.e(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = cVar2.f8410f;
        o oVar = cVar2.f8409e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) oVar.getValue()).getAll();
            j.d(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) oVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
