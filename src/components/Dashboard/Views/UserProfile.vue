<template>
    <div class="row">
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <div class="col-lg-3 col-md-4">
        <edit-profile-form>
        </edit-profile-form>
      </div>
      <button type="submit" class="btn btn-info btn-fill" style="float:left"><a href="/#/admin/overview" style="color:white" class="ti-arrow-left"> Back</a></button>
      <button type="submit" class="btn btn-info btn-fill" style="float:right"><a href="/#/admin/stats" style="color:white" class="ti-arrow-right"> Next</a></button>
    </div>
</template>
<script>
  import EditProfileForm from './UserProfile/EditProfileForm.vue'
  export default {
    components: {
      EditProfileForm
    },
    data () {
      return {
        items: []
      }
    }
  }

</script>
<style>

</style>
