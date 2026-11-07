package H7;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p151p.C1256n;
import p151p.V;

/* JADX INFO: renamed from: H7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f3465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f3466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3467f;

    public C0227a(int i10) {
        this.f3462a = i10;
        switch (i10) {
            case 1:
                this.f3463b = true;
                this.f3465d = "    ";
                this.f3466e = "type";
                this.f3464c = true;
                this.f3467f = Z9.a.f11040s;
                break;
            default:
                this.f3465d = new HashMap();
                this.f3466e = new HashSet();
                break;
        }
    }

    public boolean a(InterfaceC0235i interfaceC0235i) {
        int id = interfaceC0235i.getId();
        HashSet hashSet = (HashSet) this.f3466e;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        InterfaceC0235i interfaceC0235i2 = (InterfaceC0235i) ((HashMap) this.f3465d).get(Integer.valueOf(c()));
        if (interfaceC0235i2 != null) {
            e(interfaceC0235i2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC0235i.isChecked()) {
            interfaceC0235i.setChecked(true);
        }
        return zAdd;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f3466e);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0235i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.f3466e;
        if (!this.f3463b || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        C1256n c1256n = (C1256n) this.f3467f;
        if (c1256n != null) {
            new HashSet((HashSet) this.f3466e);
            ChipGroup chipGroup = (ChipGroup) c1256n.f20747s;
            p240y7.g gVar = chipGroup.f14813x;
            if (gVar != null) {
                chipGroup.f14814y.b(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((V) gVar).f20603r;
                if (chipGroup2.f14814y.f3463b) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public boolean e(InterfaceC0235i interfaceC0235i, boolean z10) {
        int id = interfaceC0235i.getId();
        HashSet hashSet = (HashSet) this.f3466e;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC0235i.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC0235i.isChecked()) {
            interfaceC0235i.setChecked(false);
        }
        return zRemove;
    }

    public String toString() {
        switch (this.f3462a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f3463b + ", prettyPrintIndent='" + ((String) this.f3465d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f3466e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f3464c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((Z9.a) this.f3467f) + ')';
            default:
                return super.toString();
        }
    }
}
