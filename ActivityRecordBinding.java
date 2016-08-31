package info.audio.analysis.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityRecordBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ContentFftBinding included;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityRecordBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout,
      ContentFftBinding included, NavigationView navView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinatorLayout = coordinatorLayout;
    this.drawerLayout = drawerLayout;
    this.included = included;
    setContainedBinding(this.included);;
    this.navView = navView;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityRecordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityRecordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityRecordBinding>inflate(inflater, info.audio.analysis.R.layout.activity_record, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityRecordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityRecordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityRecordBinding>inflate(inflater, info.audio.analysis.R.layout.activity_record, null, false, component);
  }

  @NonNull
  public static ActivityRecordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityRecordBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityRecordBinding)bind(component, view, info.audio.analysis.R.layout.activity_record);
  }
}
