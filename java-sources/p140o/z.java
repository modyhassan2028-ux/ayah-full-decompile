package p140o;

import C1.a;
import K0.AbstractC0332a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public class z extends AbstractC0332a implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20206c;

    public z(Context context, k kVar) {
        super(context);
        if (kVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f20206c = kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return i(this.f20206c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f20206c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = i(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f20206c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        O o10 = (O) this.f5053b;
        if (o10 != null) {
            o10.clear();
        }
        this.f20206c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f20206c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return i(this.f20206c.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return i(this.f20206c.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f20206c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f20206c.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f20206c.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f20206c.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((O) this.f5053b) != null) {
            int i11 = 0;
            while (true) {
                O o10 = (O) this.f5053b;
                if (i11 >= o10.f22703t) {
                    break;
                }
                if (((a) o10.f(i11)).getGroupId() == i10) {
                    ((O) this.f5053b).g(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f20206c.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((O) this.f5053b) != null) {
            int i11 = 0;
            while (true) {
                O o10 = (O) this.f5053b;
                if (i11 >= o10.f22703t) {
                    break;
                }
                if (((a) o10.f(i11)).getItemId() == i10) {
                    ((O) this.f5053b).g(i11);
                    break;
                }
                i11++;
            }
        }
        this.f20206c.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f20206c.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f20206c.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f20206c.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f20206c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f20206c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.f20206c.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return i(this.f20206c.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f20206c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return i(this.f20206c.a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f20206c.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return i(this.f20206c.add(i10, i11, i12, i13));
    }
}
