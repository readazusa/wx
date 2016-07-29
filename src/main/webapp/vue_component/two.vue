<template lang="jade">
    div.my-component
       h2 {{msg}}
    other-component
</template>

<script>
    import OtherComponent from "./one.vue";
    export default{
        components:{OtherComponent}.
        data():{
          return:{
             msg:"heasdads";
          }
        }
    }
</script>

<style lang="saas" scoped>
   .my-component{
       color:#333;
   }
</style>