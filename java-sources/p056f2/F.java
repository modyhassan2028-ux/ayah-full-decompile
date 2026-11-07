package p056f2;

import X4.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p000a.a;
import p053f.i;
import p120l9.l;
import p120l9.n;
import p120l9.s;
import p120l9.w;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class F extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15940b;

    public /* synthetic */ F(int i10) {
        this.f15940b = i10;
    }

    @Override // p000a.a
    public c K(Context context, Object obj) {
        switch (this.f15940b) {
            case 1:
                String[] strArr = (String[]) obj;
                j.e(strArr, "input");
                if (strArr.length == 0) {
                    return new c(s.f19441r);
                }
                for (String str : strArr) {
                    if (p181s2.s.c(context, str) != 0) {
                        return null;
                    }
                }
                int iG0 = w.g0(strArr.length);
                if (iG0 < 16) {
                    iG0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new c(linkedHashMap);
            case 2:
                String str3 = (String) obj;
                j.e(str3, "input");
                if (p181s2.s.c(context, str3) == 0) {
                    return new c(Boolean.TRUE);
                }
                return null;
            default:
                return super.K(context, obj);
        }
    }

    @Override // p000a.a
    public final Object c0(Intent intent, int i10) {
        switch (this.f15940b) {
            case 0:
                return new p053f.a(intent, i10);
            case 1:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i11 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i11 == 0));
                        }
                        ArrayList arrayListI0 = l.i0(stringArrayExtra);
                        Iterator it = arrayListI0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(n.a0(arrayListI0, 10), n.a0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new p110k9.j(it.next(), it2.next()));
                        }
                        return w.j0(arrayList2);
                    }
                }
                return s.f19441r;
            case 2:
                if (intent == null || i10 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z10 = false;
                if (intArrayExtra2 != null) {
                    for (int i12 : intArrayExtra2) {
                        if (i12 == 0) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                return new p053f.a(intent, i10);
        }
    }

    @Override // p000a.a
    public final Intent t(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f15940b) {
            case 0:
                i iVar = (i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.f15885s;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        iVar = new i(iVar.f15884r, null, iVar.f15886t, iVar.f15887u);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (K.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                j.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                j.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                j.e(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                j.d(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            default:
                Intent intent3 = (Intent) obj;
                j.e(intent3, "input");
                return intent3;
        }
    }
}
