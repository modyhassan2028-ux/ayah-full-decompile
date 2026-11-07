package p020c;

import C2.b;
import X4.c;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.InterfaceC0769s;
import com.google.android.gms.internal.measurement.B1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p053f.a;
import p053f.d;
import p053f.e;
import p053f.f;
import p053f.g;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13382a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13383b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13384c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13385d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f13386e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f13387f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13388h;

    public i(ComponentActivity componentActivity) {
        this.f13388h = componentActivity;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f13382a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f13386e.get(str);
        if ((dVar != null ? dVar.f15875a : null) != null) {
            ArrayList arrayList = this.f13385d;
            if (arrayList.contains(str)) {
                dVar.f15875a.d(dVar.f15876b.c0(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f13387f.remove(str);
        this.g.putParcelable(str, new a(intent, i11));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i10, p000a.a aVar, Object obj) {
        Bundle bundleExtra;
        int i11;
        ComponentActivity componentActivity = this.f13388h;
        c cVarK = aVar.K(componentActivity, obj);
        if (cVarK != null) {
            new Handler(Looper.getMainLooper()).post(new b(i10, 1, this, cVarK));
            return;
        }
        Intent intentT = aVar.t(componentActivity, obj);
        if (intentT.getExtras() != null) {
            Bundle extras = intentT.getExtras();
            j.b(extras);
            if (extras.getClassLoader() == null) {
                intentT.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentT.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentT.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentT.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentT.getAction())) {
            String[] stringArrayExtra = intentT.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                if (TextUtils.isEmpty(stringArrayExtra[i12])) {
                    throw new IllegalArgumentException(p.B(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i12));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i13 = 0;
                for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                    if (!hashSet.contains(Integer.valueOf(i14))) {
                        strArr[i13] = stringArrayExtra[i14];
                        i13++;
                    }
                }
            }
            if (componentActivity instanceof p216w1.a) {
            }
            componentActivity.requestPermissions(stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentT.getAction())) {
            componentActivity.startActivityForResult(intentT, i10, bundle);
            return;
        }
        p053f.i iVar = (p053f.i) intentT.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            j.b(iVar);
            i11 = i10;
            try {
                componentActivity.startIntentSenderForResult(iVar.f15884r, i11, iVar.f15885s, iVar.f15886t, iVar.f15887u, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new b(i11, 2, this, e));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i11 = i10;
        }
    }

    public final g c(String str, p000a.a aVar, p053f.b bVar) {
        j.e(str, "key");
        d(str);
        this.f13386e.put(str, new d(bVar, aVar));
        LinkedHashMap linkedHashMap = this.f13387f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.d(obj);
        }
        Bundle bundle = this.g;
        a aVar2 = (a) B1.D(str, bundle);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.d(aVar.c0(aVar2.f15870s, aVar2.f15869r));
        }
        return new g(this, str, aVar, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f13383b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new G9.a(new G9.g(f.f15879r, new A3.d(29), 2))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f13382a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        j.e(str, "key");
        if (!this.f13385d.contains(str) && (num = (Integer) this.f13383b.remove(str)) != null) {
            this.f13382a.remove(num);
        }
        this.f13386e.remove(str);
        LinkedHashMap linkedHashMap = this.f13387f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbD = p.D("Dropping pending result for request ", str, ": ");
            sbD.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbD.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) B1.D(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f13384c;
        e eVar = (e) linkedHashMap2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.f15878b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                eVar.f15877a.f((InterfaceC0769s) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
